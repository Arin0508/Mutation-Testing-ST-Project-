package src;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for Array Functions Library.
 */
public class AppTest 
{	
	App obj = new App();
	
    @Test
    public void TestEditDistance() {
    	 String str1 = "sunday";
         String str2 = "saturday";
  
         int n = str1.length(), m = str2.length();
         int[][] dp = new int[n + 1][m + 1];
         for (int i = 0; i < n + 1; i++)
             Arrays.fill(dp[i], -1);
         assertEquals(3, obj.EditDistance(str1, str2, n, m, dp), 0.0);
         
         str1 = "dinitrophenylhydrazine";
         str2 = "benzalphenylhydrazone";
  
         n = str1.length();
         m = str2.length();
         dp = new int[n + 1][m + 1];
         for (int i = 0; i < n + 1; i++)
             Arrays.fill(dp[i], -1);
         assertEquals(7, obj.EditDistance(str1, str2, n, m, dp), 0.0);
         
         str1 = "quantumcomputingdynamicprogramming";
         str2 = "quancmpdmicprmmi";
  
         n = str1.length();
         m = str2.length();
         dp = new int[n + 1][m + 1];
         for (int i = 0; i < n + 1; i++)
             Arrays.fill(dp[i], -1);
         assertEquals(18, obj.EditDistance(str1, str2, n, m, dp), 0.0);

    }
    
    @Test
    public void TestKMPAlgorithm()
    {
    	String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        assertEquals(10, obj.KMPSearch(pat, txt), 0.0);
        
        txt = "HSKCMJEHSTABRABCUHSGDFYUGSUDVBDUSHVBDUHBVSUHDG";
        pat = "HSKC";
        assertEquals(0, obj.KMPSearch(pat, txt), 0.0);
        
        txt = "BDUHBVSUHDG";
        pat = "DJKNSJK";
        assertEquals(-1, obj.KMPSearch(pat, txt), 0.0);
        
        txt = "ASDFGH";
        pat = "GHI";
        assertEquals(-1, obj.KMPSearch(pat, txt));
    }
////    	
    @Test	
    public void TestRabinKarp()
    {
    	 String txt = "HSKCMJEHSTABRABCUHSGDFYUGSUDVBDUSHVBDUHBVSUHDG";
         String pat = "ABRA";
         // A prime number
         int q = 101;
      	assertEquals(10, obj.RabinKarp(pat, txt, q), 0.0);
      	
      	txt = "JHDYEKCHSPLQJAYDABRANCJKSDNFNJKDNCCDJKNFJKDN";
        pat = "JHDY";
        assertEquals(0, obj.RabinKarp(pat, txt, q), 0.0);
        
        txt = "BDUHBVSUHDG";
        pat = "DJKNSJK";
        assertEquals(-1, obj.RabinKarp(pat, txt, q), 0.0);
        
        txt = "BDUHBVSUHDG";
        pat = "DGFDHBJDKBJ";
        assertEquals(-1, obj.RabinKarp(pat, txt, q), 0.0);
        
        txt = "dhjbdjs";
        pat = "js";
        assertEquals(5, obj.RabinKarp(pat, txt, q), 0.0);
    }
    
    @Test
    public void TestZAlgorithm()
    {	
    	String text = "JHDYEKCHSPLQJAYDABRANCJKSDNFNJKDNCCDJKNFJKDN";
        String pattern = "DABRA";
        assertEquals(15, obj.ZAlgorithm(text, pattern), 0.0);
        
        text = "HSKCMJEHSTABRABCUHSGDFYUGSUDVBDUSHVBDUHBVSUHDG";
        pattern = "ABRA";
        assertEquals(10, obj.ZAlgorithm(text, pattern), 0.0);
        
        text = "BDUHBVSUHDG";
        pattern = "DJKNSJKJSDJWESUJSD";
        assertEquals(-1, obj.ZAlgorithm(text, pattern), 0.0);
        
        text = "";
        pattern = "dfsdfs";
        assertEquals(-1, obj.ZAlgorithm(text, pattern), 0.0);
        
        text = "ABCDFFGH";
        pattern = "H";
        assertEquals(7, obj.ZAlgorithm(text, pattern), 0.0);
        
        text = "aaaaaaaaaaaa";
        pattern = "aa";
        assertEquals(0, obj.ZAlgorithm(text, pattern));
    }
    
    @Test
    public void TestShortestCommonSequence()
    {	
    	 String X = "AGGTB";
         String Y = "GXTXAYB";
  
         int[][] lookup
             = new int[X.length() + 1][Y.length() + 1];
  
        assertEquals(9, obj.superSeq(X, Y, X.length(), Y.length(), lookup), 0.0);
        
        X = "apqrstu";
        Y = "kplrmntuo";
        lookup
        = new int[X.length() + 1][Y.length() + 1];
        assertEquals(12, obj.superSeq(X, Y, X.length(), Y.length(), lookup), 0.0);
    }
    
    @Test
    public void TestLCS()
    {	
    	String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	    assertEquals(4, obj.LCS(X, Y, m, n), 0.0);
	    
	    s1 = "ABRACADABRA";
	    s2 = "YABBADABBADOO";
	    X=s1.toCharArray(); 
	    Y=s2.toCharArray(); 
	    m = X.length; 
	    n = Y.length; 
	    assertEquals(7, obj.LCS(X, Y, m, n), 0.0);
    }
    
    @Test
    public void TestLSFP()
    {	
    	String s = "adbabd";
         
	    // Length of given string
	    int n = s.length();
	     
	    // Function call
	    assertEquals(6, obj.longestSubstring(s, n), 0.0);
	    s = "pqrstuabcdefffghijkahgjgujgjudykisykiuljiktytertersrgdghfhfhfhxf";
	    n = s.length();
	    assertEquals(9, obj.longestSubstring(s, n), 0.0);
    }
    
    @Test
    public void TestLVP()
    {	
    	assertEquals(8, obj.LVP("((()()()()(((())", 16), 0.0);
    	assertEquals(0, obj.LVP("((((((", 6), 0.0);
    	assertEquals(2, obj.LVP("())))))))", 9), 0.0);
    	assertEquals(0, obj.LVP(")", 1));
    	assertEquals(0, obj.LVP("", 0));
    }
    
    @Test
    public void TestLongestCommonPrefix() {
    	String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
    	assertEquals("gee", obj.longestCommonPrefix(input));
    	
    	String[] input1 = {"zacchsdjiwsbd", "zaccvbhdbfeui", "zaccbuivghdreuhg", "zaccfguieh", "zaccbfuid", "zaccghuvbifryhe", "zaccvbuidfb", "zacchbfui", "zaccbuidf"};
    	assertEquals("zacc", obj.longestCommonPrefix(input1));
    	
    	String[] input2 = {"reflower","flow","flight"};
    	assertEquals("", obj.longestCommonPrefix(input2));
    	
    	String[] input3 = {"reflower"};
    	assertEquals("reflower", obj.longestCommonPrefix(input3));
    	
    	String[] input4 = {};
    	assertEquals("", obj.longestCommonPrefix(input4));
    	
    	String[] input5 = {"dcnsj", "dsdsd", "djsjs"};
    	assertEquals("d", obj.longestCommonPrefix(input5));
    }
    
    @Test
    public void TestLongestPalindromicSubsequence() {
    	String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        assertEquals(5, obj.lps(seq.toCharArray(), 0, n - 1), 0.0);
        
        String text = "abbcbbaj";
        n = text.length();
        assertEquals(7, obj.lps(text.toCharArray(), 0, n - 1), 0.0);
        
//        seq = "bdusiwbauibwuisdbcwquibduiwboqibxwuqibxquiwbx";
//        n = seq.length();
//        assertEquals(23, obj.lps(seq.toCharArray(), 0, n - 1), 0.0);
    }
   
    @Test
    public void TestManachersAlgorithm() {
    	String text = "abacdfgdcaba";
        assertEquals("aba", obj.ManachersAlgorithm(text));
        text = "abcdeghghijkalmnahgyuwdggggaygufgsiugfisuuuuaaagggauuuuuuuhhhabbbbiiiiiiiiisssssssssoooooooaaauuuuuu";
        assertEquals("iiiiiiiii", obj.ManachersAlgorithm(text));
        
        text = "jdfhsjkhdf";
        assertEquals("d", obj.ManachersAlgorithm(text));
        
        text = "aabbbbaababababa";
        assertEquals("ababababa", obj.ManachersAlgorithm(text));
    }
    
    @Test
    public void TestBoyerMoore() {
    	char txt[] = "ABAAABCD".toCharArray();
        char pat[] = "ABC".toCharArray(); 
        assertEquals(4, obj.BoyerMoore(txt, pat));
        
        txt = "BDUHBVSUHDG".toCharArray();
        pat = "DJKNSJKJSDJWESUJSD".toCharArray();
        assertEquals(-1, obj.BoyerMoore(txt, pat), 0.0);
    }
    
    @Test
    public void TestSequenceAlignment() {
    	String gene1 = "AGGGCT";
        String gene2 = "AGGCA";
         
        // initialising penalties
        // of different types
        int misMatchPenalty = 3;
        int gapPenalty = 2;
     
        // calling the function to
        // calculate the result
        assertEquals(5, obj.SequenceAlignment(gene1, gene2, misMatchPenalty, gapPenalty));
        
        gene1 = "CG";
        gene2 = "CA";
        misMatchPenalty = 3;
        gapPenalty = 7;
        assertEquals(3, obj.SequenceAlignment(gene1, gene2, misMatchPenalty, gapPenalty));
        
        gene1 = "";
        gene2 = "AGGCA";
        misMatchPenalty = 3;
        gapPenalty = 2;
        assertEquals(10, obj.SequenceAlignment(gene1, gene2, misMatchPenalty, gapPenalty));
        
        gene1 = "AGGGCT";
        gene2 = "";
        misMatchPenalty = 3;
        gapPenalty = 2;
        assertEquals(12, obj.SequenceAlignment(gene1, gene2, misMatchPenalty, gapPenalty));
        
        gene1 = "sdbsjkdnbjksbndjk";
        gene2 = "snajksnjkansjkasn";
        misMatchPenalty = 3;
        gapPenalty = 2;
        assertEquals(27, obj.SequenceAlignment(gene1, gene2, misMatchPenalty, gapPenalty));
        
        
    }
    
    @Test
    public void TestWildcardPattern() {
    	String str = "baaabab";
        String pattern = "*****ba*****ab";
        assertEquals(true, obj.WildcardPattern(str, pattern, str.length(), pattern.length()));
        
        str = "babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab";
        pattern = "***bba**a*bbba**aab**";
        assertEquals(true, obj.WildcardPattern(str, pattern, str.length(), pattern.length()));
        
        str = "";
        pattern = "dksbndfjk";
        assertEquals(false, obj.WildcardPattern(str, pattern, str.length(), pattern.length()));
        
        str="cojkdsmcos";
        pattern = "";
        assertEquals(false, obj.WildcardPattern(str, pattern, str.length(), pattern.length()));
        
        str = "";
        pattern = "";
        assertEquals(true, obj.WildcardPattern(str, pattern, str.length(), pattern.length()));
    }
    
    @Test
    public void TestminPalPartition() {
        String str = "ababbbabbababa";
    	assertEquals(3, obj.minPalPartition(str));
    }
    
    @Test
    public void TestSparseSearch() {
    	String arr[] = {"for", "hjcbs", "", "", "", "", "ide",
                "pracs", "", "", "", "quiz"};
    	String x = "for";
    	int n = x.length();
    	assertEquals(0, obj.SparseSearch(arr, x, n));
    	
    	String arr1[] = {"amdck", "bdhsd", "", "", "", "", "ide"};
    	String x1 = "bdhsd";
    	int n1 = x1.length();
    	assertEquals(1, obj.SparseSearch(arr1, x1, n1));
    	
    	
    	String arr2[] = {"for", "hjcbs", "", "", "", "cnjdk"};
    	String x2 = "jki";
    	int n2 = x2.length();
    	assertEquals(-1, obj.SparseSearch(arr2, x2, n2));
    	
    	String arr3[] = {"", "", ""};
    	String x3 = "jki";
    	int n3 = x3.length();
    	assertEquals(-1, obj.SparseSearch(arr3, x3, n3));
    	
    	// String arr4[] = {"", "", "", "dwe", "", "zz"};
    	// String x4 = "zz";
    	// int n4 = x4.length();
    	// assertEquals(5, obj.SparseSearch(arr4, x4, n4));
    }
    
    @Test
    public void TestLongestRepeatingSubSeq() {
    	 String str = "aabb";
    	assertEquals(2, obj.LongestRepeatingSubSeq(str));
    }
    
    @Test
    public void TestLongestPrefixSuffix() {
    	 String str = "abcab";
    	assertEquals(2, obj.longestPrefixSuffix(str));
    	str = "asdfgjndjkdnjkendjkvnsdjknjkdnwuhnclwiosdcnklwnasdfg";
    	assertEquals(5, obj.longestPrefixSuffix(str));
    	str = "fcdjksncjksndcjksd";
    	assertEquals(0, obj.longestPrefixSuffix(str));
    } 
    
    @Test
    public void TestKVowelWords() {
    	int N = 3;
        int K = 3;
        assertEquals(17576, obj.KVowelWords(N, K));
    }
    
    @Test
    public void TestLRR() {
    	String str = "ncbjknsdjkcnsjkancjksdncjksdncjk";
        assertEquals("jknsdjkcnsjkancjksdncjksdncjkncb", obj.leftrotate(str, 3));
        assertEquals("jkncbjknsdjkcnsjkancjksdncjksdnc", obj.rightrotate(str, 2));
        
    }
    
    @Test
    public void TestReverseVowel() {
    	String str= "hello world";
        assertEquals("hollo werld", obj.reverseVowel(str));
        
    }
    
    @Test
    public void TestRepeatedStringMatch() {
    	String a = "abcd", b = "cdabcdab";
    	assertEquals(3, obj.repeatedStringMatch(a, b));
    	a = "abcde";
    	b = "bcdeabcdeabcdeabcdeabcd";
    	assertEquals(5, obj.repeatedStringMatch(a, b));
    	a = "cdmnslkd";
    	b = "iwomeiofnmwo";
    	assertEquals(-1, obj.repeatedStringMatch(a, b));
    }
    
    @Test
    public void testFindAllConcatenatedWordsInADict() {
        // Test Case 1: Empty array
        String[] words1 = {};
        assertEquals(0, obj.findAllConcatenatedWordsInADict(words1).size());

        // Test Case 2: No concatenated words
        String[] words2 = {"apple", "banana", "orange"};
        assertEquals(0, obj.findAllConcatenatedWordsInADict(words2).size());

        // Test Case 3: Single concatenated word
        String[] words3 = {"cat", "dog", "catdog"};
        assertEquals(1, obj.findAllConcatenatedWordsInADict(words3).size());
        assertTrue(obj.findAllConcatenatedWordsInADict(words3).contains("catdog"));

        // Test Case 4: Multiple concatenated words
        String[] words4 = {"hello", "world", "helloworld", "concat", "enated", "concatenated"};
        assertEquals(2, obj.findAllConcatenatedWordsInADict(words4).size());
        assertTrue(obj.findAllConcatenatedWordsInADict(words4).contains("helloworld"));
        assertTrue(obj.findAllConcatenatedWordsInADict(words4).contains("concatenated"));
    }
    @Test
    public void testWordBreak1() {
        // Test Case 2: No valid word break
        String s2 = "catsandog";
        List<String> wordDict2 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(obj.wordBreak1(s2, wordDict2));

        // Test Case 3: Valid word break
        String s3 = "applepenapple";
        List<String> wordDict3 = Arrays.asList("apple", "pen");
        assertTrue(obj.wordBreak1(s3, wordDict3));
        
        // Test Case 4: Complex word break
        String s4 = "catsanddog";
        List<String> wordDict4 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertTrue(obj.wordBreak1(s4, wordDict4));
    }
    @Test
    public void testWordBreak2() {
        // Test Case 2: No valid word break
        String s2 = "catsandog";
        List<String> wordDict2 = Arrays.asList("cats","dog","sand","and","cat");
        assertEquals(0, obj.wordBreak2(s2, wordDict2).size());

        // Test Case 3: Valid word break
        String s3 = "catsanddog";
        List<String> wordDict3 = Arrays.asList("cat", "cats", "and", "sand", "dog");
        assertEquals(Arrays.asList("cat sand dog", "cats and dog"), obj.wordBreak2(s3, wordDict3));

        // Test Case 4: Complex word break with duplicates
        String s4 = "aaa";
        List<String> wordDict4 = Arrays.asList("a", "aa");
        assertEquals(Arrays.asList("a aa", "a a a", "aa a"), obj.wordBreak2(s4, wordDict4));
    }

    @Test
    public void testIsScramble() {
        // Test Case 1: Valid scramble
        assertTrue(obj.isScramble("great", "rgeat"));

        // Test Case 2: Invalid scramble
        assertFalse(obj.isScramble("abcde", "caebd"));

        // Test Case 3: Single character strings
        assertTrue(obj.isScramble("a", "a"));

    }
    @Test
    public void testAtMostNGivenDigitSet() {
        // Test Case 1
        String[] digits1 = {"1", "3", "5", "7"};
        int n1 = 100;
        assertEquals(20, obj.atMostNGivenDigitSet(digits1, n1));

        // Test Case 2
        String[] digits2 = {"1", "4", "9"};
        int n2 = 1000000000;
        assertEquals(29523, obj.atMostNGivenDigitSet(digits2, n2));

        // Test Case 3
        String[] digits3 = {"7"};
        int n3 = 8;
        assertEquals(1, obj.atMostNGivenDigitSet(digits3, n3));

    }

    @Test
    public void TestminStickers() {
        String stickers[] = {"with","example","science"};
        String target = "thehat";
        assertEquals(3, obj.minStickers(stickers, target));
        String stickers1[] = {"notice","possible"};
        String target1 = "basicbasic";
        assertEquals(-1, obj.minStickers(stickers1, target1));
    }

    @Test
    public void TestpalindromePairs() {
        String words[] = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> ans = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4)
        ));
        assertEquals(ans, obj.palindromePairs(words));
        String words1[] = {"bat","tab","cat"};
        List<List<Integer>> ans1 = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        ));
        assertEquals(ans1, obj.palindromePairs(words1));
        String words2[] = {"a",""};
        List<List<Integer>> ans2 = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 0),
                Arrays.asList(0, 1)
        ));
        assertEquals(ans2, obj.palindromePairs(words2));
    }

    @Test
    public void TestkSimilarity() {
        String a = "ab", b = "ba";
        assertEquals(1, obj.kSimilarity(a, b));
        a = "abc";
        b = "bca";
        assertEquals(2, obj.kSimilarity(a, b));
    }
}
