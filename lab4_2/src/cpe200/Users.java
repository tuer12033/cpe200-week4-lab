package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList=new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
    }

    public void deleteUser(User user)
    {
        userList.remove(user);

    }

    public boolean exists(User user)
    {
        if(userList.contains(user)){
        return true;}
        else{
            return false;
        }
    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (int i = 0; i <this.userList.size() ; i++) {
            if(this.userList.get(i).userName == userName)
            {
                return userList.get(i);
            }

        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        User[] user=new User[userList.size()];
        for(int i=0;i<userList.size();i++)
        {
            user[i]=userList.get(i);
        }
        return user;
    }
}
