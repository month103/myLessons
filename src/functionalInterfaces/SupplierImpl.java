package functionalInterfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.println(supplier.get());

        Supplier<List<User>> supplier2 = () -> {
            List<User> users = new ArrayList<>();
            users.add(new User("Kate", 232553, 124234));
            users.add(new User("Max", 67832553, 124234));
            users.add(new User("Dan", 932553, 124234));
            users.add(new User("Sole", 65553, 124234));
            return users;
        };
        System.out.println(supplier2.get());
    }


}
