// SynonymHandler

/****************************************************************

SynonymHandler handles information about synonyms for various
words.

The synonym data can be read from a file and handled in various
ways. These data consists of several lines, where each line begins
with a word, and this word is followed with a number of synonyms.

The synonym line for a given word can be obtained. It is possible
to add a synonym line, and to remove the synonym line for a given
word. Also a synonym for a particular word can be added, or
removed. The synonym data can be sorted. Lastly, the data can be
written to a given file.

Author: Fadil Galjic

****************************************************************/

import java.io.*;    // FileReader, BufferedReader, PrintWriter,
                     // IOException
import java.util.*;  // LinkedList

class SynonymHandler
{
	// readSynonymData reads the synonym data from a given file
	// and returns the data as an array
    public static String[] readSynonymData (String synonymFile) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(synonymFile));
        LinkedList<String> synonymLines = new LinkedList<>();
        String synonymLine = reader.readLine();
        while (synonymLine != null)
        {
			synonymLines.add(synonymLine);
			synonymLine = reader.readLine();
		}
		reader.close();

		String[] synonymData = new String[synonymLines.size()];
		synonymLines.toArray(synonymData);

		return synonymData;
    }

    // writeSynonymData writes a given synonym data to a given
    // file
    public static void writeSynonymData (String[] synonymData,String synonymFile) throws IOException
    {
        PrintWriter writer = new PrintWriter(synonymFile);
        for (String synonymLine : synonymData)
            writer.println(synonymLine);
        writer.close();

    }

    // synonymLineIndex accepts synonym data, and returns the
    // index of the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	private static int synonymLineIndex (String[] synonymData,String word) 
    {
		int delimiterIndex = 0;
		String w = "";
		int i = 0;
		boolean wordFound = false;
		while (!wordFound  &&  i < synonymData.length)
		{
		    delimiterIndex = synonymData[i].indexOf('|');
		    w = synonymData[i].substring(0, delimiterIndex).trim();
		    if (w.equalsIgnoreCase(word))
				wordFound = true;
			else
				i++;
	    }

	    if (!wordFound)
            throw new IllegalArgumentException(word + " not present");

	    return i;
	}

    // getSynonymLine accepts synonym data, and returns
    // the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
    public static String getSynonymLine (String[] synonymData,String word)
    {
		int index = synonymLineIndex(synonymData, word);

	    return synonymData[index];
	}

    // addSynonymLine accepts synonym data, and adds a given synonym line to the data
	public static String[] addSynonymLine (String[] synonymData, String synonymLine)
	{
		String[] synData = new String[synonymData.length + 1];
		for (int i = 0; i < synonymData.length; i++)
		    synData[i] = synonymData[i];
		synData[synData.length - 1] = synonymLine;

	    return synData;
	}

    // removeSynonymLine accepts synonym data, and removes
    // the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	public static String[] removeSynonymLine (String[] synonymData,String word) throws IllegalArgumentException
	{
        int indexWord = synonymLineIndex(synonymData, word);
        String[] synData = new String[synonymData.length - 1];
        for (int i = 0; i < indexWord; i++)
        {
            synData[i] = synonymData[i];
        } 
        
        for (int i = indexWord + 1; i < synonymData.length; i++)
        {
            synData[i-1] = synonymData[i];
        } 
        return synData;
	}

    // addSynonym accepts synonym data, and adds a given
    // synonym for a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	public static void addSynonym (String[] synonymData,String word, String synonym)
	{
        int indexWord = synonymLineIndex(synonymData, word);
        synonymData[indexWord]+= ", " + synonym;
	}

    // removeSynonym accepts synonym data, and removes a given
    // synonym for a given word.
    // If the given word or the given synonym is not present, an
    // exception of the type IllegalArgumentException is thrown.
	public static void removeSynonym (String[] synonymData,String word, String synonym)
	{
        String synLine = getSynonymLine(synonymData, word);
        String [] tempSyn = synLine.split("[| ,]+");
        String [] finalSyn = new String[tempSyn.length - 1];
        int counter = 0;
        for(int i = 0; i < tempSyn.length; i++)
        {   
            if(!tempSyn[i].equalsIgnoreCase(synonym))
            {
                finalSyn[counter] = tempSyn[i];
                counter++;
            }
        }
        finalSyn[0] += " |";
        String synString = Arrays.toString(finalSyn).replace("[","")
        .replace("]", "").replace("|,","|");
        
        synonymData[synonymLineIndex(synonymData,word)] = synString;
    }
    // sortIgnoreCase sorts an array of strings, using
    // the selection sort algorithm
    private static void sortIgnoreCase (String[] strings)  
    {
        for(int i = 0; i < strings.length-1; i++)
        {
            int min = i;
            for(int j = i + 1; j<strings.length; j++)
            {
                if(strings[j].compareToIgnoreCase(strings[min]) < 0)
                {
                    min = j;
                }
            }
            if(i != min)
            { 
                String temp = strings[i];
                strings[i] = strings[min];
                strings[min] = temp;
            }
        }
	}

    // sortSynonymLine accepts a synonym line, and sorts
    // the synonyms in this line
    private static String sortSynonymLine (String synonymLine) 
    {
        
        String[] synLine = synonymLine.split("[|]");
        String word = synLine[0].trim();
        String [] synonym = synLine[1].trim().split("[ ,]+");
        sortIgnoreCase(synonym);
        String synTemp = Arrays.toString(synonym).replace("[","")
        .replace("]", "");
        String wordLine = word +  " | " + synTemp;
        return wordLine;
	}

    // sortSynonymData accepts synonym data, and sorts its
    // synonym lines and the synonyms in these lines
	public static void sortSynonymData (String[] synonymData)
	{
        for(int line = 0; line < synonymData.length; line++)
        {
            synonymData[line] = sortSynonymLine(synonymData[line]);
        }
        sortIgnoreCase(synonymData);
	}
}