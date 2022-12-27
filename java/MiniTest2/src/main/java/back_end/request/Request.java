package back_end.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Request {
   private String username;
   private String email;
   private String password;

   public Request(String email, String password) {
      this.email = email;
      this.password = password;
   }
}
