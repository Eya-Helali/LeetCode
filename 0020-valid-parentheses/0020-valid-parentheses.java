class Solution {
    Stack<Character> stack= new Stack();
    

public boolean isValid(String s)
{  
    for(char c: s.toCharArray())
    {
        if ((c=='(')|| (c=='{')|| (c=='[') )
        { 
            stack.push(c);
        
        }

        if ((c==')')|| (c=='}')|| (c==']') )
        {
          
         if ( stack.isEmpty() || !isMatching(stack.peek(),c) )
            {return false;}
         else  if (isMatching(stack.peek(),c))
            {stack.pop();}
            }

        }

         return stack.isEmpty();
    }

    public boolean isMatching(char opening  , char closing )
     { return( (opening=='(' && closing==')') || 
     (opening=='{' && closing=='}') ||
      (opening=='[' && closing==']'));

     }
   
    }

