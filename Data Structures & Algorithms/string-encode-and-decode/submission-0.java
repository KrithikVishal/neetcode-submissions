class Solution {

    public String encode(List<String> strs) {
        StringBuilder en= new StringBuilder();
        for(String s: strs){
            en.append(s.length()).append('#').append(s);
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        List<String> de= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i=j+1;
            de.add(str.substring(i, i+length));
            i=i+length;
        }
        return de;
    }
}