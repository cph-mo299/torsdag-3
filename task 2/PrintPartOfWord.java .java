class PrintPartOfWord
{
   
    
    public static void isSubstr(String Str,
      ArrayList<String> arr)
    {
       
      
        int flag = 0;
 
      
        for (int i = 0; i < arr.size(); i++)
        {
           
         
            if (Str.indexOf(arr.get(i)) != -1) {
 
           
                System.out.println(arr.get(i));
                flag = 1;
            }
        }
       
     
        if (flag == 0)
            System.out.print(-1);
    }
   
  
    public static void main(String[] args)
    {
        ArrayList<String> arr
            = new ArrayList<>(Arrays.asList(
                "øben", "køb", "havn", "avn", "enhav"));
        String Str = "København";
 
        isSubstr(Str, arr);
    }
}