/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMS;

import java.util.ArrayList;

/**
 *
 * @author jmyer
 */
public class UserSearch {
    public static ArrayList<UserInfo> searchByUsername(ArrayList<UserInfo> userList, String usernameToSearch) {
        ArrayList<UserInfo> searchResults = new ArrayList<>();
        UserInfo currentUser;
        int index = 0;
        
        for(index = 0; index < userList.size(); index++) {
            currentUser = userList.get(index);
            if(currentUser.getUsername().equalsIgnoreCase(usernameToSearch) == true) {
                searchResults.add(currentUser);
            }
        }
        
        return(searchResults);
    }
}
