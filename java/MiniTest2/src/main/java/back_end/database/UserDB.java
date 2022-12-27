package back_end.database;

import back_end.model.User;
import back_end.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    public static ArrayList<User> users = FileUtils.getDataFromFile("list-user.json");
}
