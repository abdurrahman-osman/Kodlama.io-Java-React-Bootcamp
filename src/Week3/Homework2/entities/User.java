package Week3.Homework2.entities;

import java.util.Date;

public class User extends BaseEntity{
   private String lastName;
   private String email;
   private String password;
   private Date birthDate;
   private Long nationalityId;
   private boolean isVerified;

   public User(int id, String name, String lastName, String email, String password, Date birthDate, Long nationalityId) {
      super(id, name);
      this.lastName = lastName;
      this.email = email;
      this.password = password;
      this.birthDate = birthDate;
      this.nationalityId = nationalityId;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Date getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
   }

   public Long getNationalityId() {
      return nationalityId;
   }

   public void setNationalityId(Long nationalityId) {
      this.nationalityId = nationalityId;
   }

   public boolean isVerified() {
      return isVerified;
   }

   public void setVerified(boolean verified) {
      isVerified = verified;
   }
}
