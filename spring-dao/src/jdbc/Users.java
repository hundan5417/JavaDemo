package jdbc;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
      private long id;
      private String name;
      private String pass;
      @Override
      public String toString(){
    	  StringBuilder stringBuilder = new StringBuilder();
    	  stringBuilder.append("[id = ").append(id).append(",");
    	  stringBuilder.append("name = ").append(name).append(",");
    	  stringBuilder.append("pass = ").append(pass).append("]");
      return stringBuilder.toString();
      }
	

}
