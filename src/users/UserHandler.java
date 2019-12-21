package users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UserHandler {
    private List<User> list = new ArrayList<>();

    public void add(User user) {
        getList().add(user);
    }

    public void userFilter(List list) {
        LocalDate thatDay = LocalDate.of(2019, 12, 8);
        Stream<User> filter = getList().stream()
                .filter(user -> user.getDate().isAfter(thatDay));

    }

    public List<User> getList() {
        return this.list;
    }
}
