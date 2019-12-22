package users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groups {
    private List<User> list = new ArrayList<>();

    public void add(User user) {
        getList().add(user);
    }

    public void sortUsers(List<User> list) {
        LocalDate thatDay = LocalDate.of(2019, 12, 8);
        Map<String, Map<String, List<User>>> userFilter = list.stream()
                .filter(user -> user.getDate().isAfter(thatDay))
                .collect(Collectors.groupingBy(User::getTeam,
                        Collectors.groupingBy(User::getMail)));
        System.out.println();
        userFilter.forEach((team, usersList) -> System.out.println(team
                + " team: "
                + usersList.keySet()));
    }

    public List<User> getList() {
        return this.list;
    }
}
