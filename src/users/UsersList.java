package users;

import java.time.LocalDate;

public class UsersList {
  public void callHandler() {
      UserHandler handler = new UserHandler();
      User one = new User("red", "someMail1", LocalDate.of(2019, 12, 10));
      User two = new User("blue", "someMail2", LocalDate.of(2019, 12, 11));
      User thee = new User("red", "someMail3", LocalDate.of(2019, 12, 12));
      User four = new User("blue", "someMail4", LocalDate.of(2019, 12, 11));
      User five = new User("red", "someMail5", LocalDate.of(2019, 12, 10));

      handler.add(one);
      handler.add(two);
      handler.add(thee);
      handler.add(four);
      handler.add(five);
  }
}
