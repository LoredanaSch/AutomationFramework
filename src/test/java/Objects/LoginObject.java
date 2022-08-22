package Objects;

import java.util.HashMap;
public class LoginObject {
  private String SignInTitle;
  private String Email;
  private String password;
  private String message;

  public LoginObject (HashMap<String, String> TestData){
       PrepareData(TestData);
  }

  public void PrepareData(HashMap<String, String> TestData){
    for(String Key: TestData.keySet()){
      switch (Key){
        case "SignInTitle":
          setSignInTitle(TestData.get(Key));
          break;
        case "Email":
          setEmail(TestData.get(Key));
          break;
        case "password":
          setPassword(TestData.get(Key));
        case "message" :
          setMessage(TestData.get(Key));
          break;
      }
    }
  }



  public String getSignInTitle() {
    return SignInTitle;
  }

  public void setSignInTitle(String signInTitle) {
    SignInTitle = signInTitle;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }





}
