//function to calculate the required result
String result(String s) {
  if( s.length > 10 )
      return (s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
  else
      return s;
}
        
