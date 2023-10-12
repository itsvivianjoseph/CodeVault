package Strings;

public class MaximumNumberofWordsFoundinSentences {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        int wordCount = 0, maxWordCount = 0;
        for(int i=0;i<sentences.length;i++)
        {
            char[] a = sentences[i].toCharArray();
            for(int j=0;j<a.length;j++) if(a[j]==' ') c++;
            wordCount = c+1;
            maxWordCount = Math.max(maxWordCount,wordCount);
            c=0;
        }
        return maxWordCount;
    }
   
}