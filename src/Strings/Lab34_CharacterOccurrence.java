public class Lab34_CharacterOccurrence {
    public static void main(String[] args) {
        String str="nenha";
        char targetChar='n';
       // int count[]=new int[256];
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch==targetChar)
            {
                count++;
            }
        }
        System.out.println("Occurrences of target char is "+count);
        }
}

