//package com.kodilla.good.patterns.challenges;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MovieStore {
//    public Map<String, List<String>> getMovies() {
//
//        List<String> ironManTranslations = new ArrayList<>();
//        ironManTranslations.add("Żelazny Człowiek");
//        ironManTranslations.add("Iron Man");
//
//        List<String> avengersTranslations = new ArrayList<>();
//        avengersTranslations.add("Mściciele");
//        avengersTranslations.add("Avengers");
//
//        List<String> flashTranslations = new ArrayList<>();
//        flashTranslations.add("Błyskawica");
//        flashTranslations.add("Flash");
//
//        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
//        booksTitlesWithTranslations.put("IM", ironManTranslations);
//        booksTitlesWithTranslations.put("AV", avengersTranslations);
//        booksTitlesWithTranslations.put("FL", flashTranslations);
//
//        return booksTitlesWithTranslations.stream()
//                .
//    }
//}
//        Wykorzystując poznane już Streamy wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu separując
//        je wykrzyknikiem:

//package com.kodilla.stream.forum;
//
//        import java.util.HashSet;
//        import java.util.Set;
//        import java.util.stream.Collectors;
//
//public final class ForumUser {
//
//    private final String userName;
//    private final String realName;
//    private final String location;
//    private final Set<ForumUser> friends = new HashSet<>();
//
//    public ForumUser(String userName, String realName, String location) {
//        this.userName = userName;
//        this.realName = realName;
//        this.location = location;
//    }
//
//    public void addFriend(ForumUser user){
//        friends.add(user);
//    }
//
//    public boolean removeFriend(ForumUser user) {
//        return friends.remove(user);
//    }
//    public Set<String> getLocationsOffFriends(){
//        return friends.stream()
//                .map(friend -> friend.getLocation())
//                .collect(Collectors.toSet());
//    }
//    public Set<String> getLocationsOfFriendsOfFriends(){
//        return friends.stream()
//                .flatMap(user -> user.getFriends().stream())
//                .filter(user -> user != this)
//                .map(ForumUser::getLocation)
//                .collect(Collectors.toSet());
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getRealName() {
//        return realName;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public Set<ForumUser> getFriends() {
//        return friends;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ForumUser forumUser = (ForumUser) o;
//
//        return userName.equals(forumUser.userName);
//    }
//
//    @Override
//    public int hashCode() {
//        return userName.hashCode();
//    }
//}
//
//public class SimpleInvoice {
//    private final List<SimpleItem> items = new ArrayList<>();
//
//    public void addItem(SimpleItem item) {
//        items.add(item);
//    }
//
//    public boolean removeItem(SimpleItem item) {
//        return items.remove(item);
//    }
//
//    public double getValueToPay() {
//        return items.stream()
//                .collect(Collectors.summingDouble(SimpleItem::getValue));
//
//    }
//}
//
