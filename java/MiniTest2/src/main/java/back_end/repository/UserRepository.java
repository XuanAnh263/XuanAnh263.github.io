package back_end.repository;

import back_end.database.UserDB;
import back_end.model.User;
import back_end.utils.FileUtils;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRepository {
    public ArrayList<User> findAll() {
        return UserDB.users;
    }

    public void updateFiles(ArrayList<User> users) {
        FileUtils.setDataToFile("list-user.json", users);
    }
}
