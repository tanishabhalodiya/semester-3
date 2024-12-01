import java.util.*;
class Music
{
    class Node{
        String data;
        Node lptr;
        Node rptr;

        public Node(String x){
            this.data=x;
            this.lptr=null;
            this.rptr=null;
        }
    }
    Node last;
    Node first;
    Node currentSong;
    int count=0;

    //insert a song at first in doubly linked list
    public void insert_at_first(String x){
        Node new_n=new Node(x);
        if(first==null)
        {
            new_n.lptr=null;
            new_n.rptr=null;
            first=last=new_n;
            currentSong=first;
            return;

        }
        else
        {
            first.lptr=new_n;
            new_n.rptr=first;
            first=new_n;
            currentSong=first;
        }
    }

    //play previous song 
    public void previousSong(){
        if(first==null){
            System.out.println("there is no any song present.");
            return;
        }
        else if(currentSong==first){
            System.out.println("Previous song is not available");
        }
        currentSong=currentSong.lptr;
        System.out.println("Previous song is : "+currentSong.data);
    }

    //repeat current song display
    public void currentSong(){
        if(first==null){
            System.out.println("There is no any song availabale.");
            return;
        }
        System.out.println("Current song is plaing right now : "+currentSong.data);
    }

    //play next song in playlist
    public void nextSong(){
        if(first==null){
            System.out.println("There is no any song available");
            return;
        }
        if(currentSong==last){
            System.out.println("Next song is not found.");
            return;
        }
        currentSong=currentSong.rptr;
        System.out.println("Next song is : "+currentSong.data);
    }

    //delete current song
    public void deleteSong(){
        if(first==null){
            System.out.println("there is no any song to delete");
        }
        else if(currentSong==first){
            //to delete current song 
            first=first.rptr;
            first.lptr=null;
            currentSong=first;

            System.out.println("Current song after delete: "+currentSong.data);
        }
        else if(currentSong==last){
            last=last.lptr;
            last.rptr=null;
            currentSong=last;
        }
        else{
            //to delete current 
            currentSong.rptr.lptr=currentSong.lptr;
            currentSong.lptr.rptr=currentSong.rptr;
            currentSong=currentSong.rptr;

            System.out.println("current song after delete is : "+currentSong);
        }
    }

    //delete the perticular song
    public void deletePerticular(String music){
        if(first==null){
            System.out.println("there is no any song in playlist");
        }
        //we will compare string with equals method
        //if delete node is first
        if(music.equals(first.data)){
            first=first.rptr;
            first.lptr=null;
            return;
        }
        //delete node is not first , we will delete dave node
        Node save=first.rptr;
        Node pred=first;
        while(save != null && !music.equals(save.data)){
            pred=save;
            save=save.rptr;
        }
        if(save == null){
            System.out.println("Song is not found which you want to delete");
        }
        else if(save == last){
            pred.rptr=save.rptr;
            last=pred;
            return;
        }
        else {
            pred.rptr=save.rptr;
            save.rptr.lptr=pred;
        }
    }

    //display the playlist
    public void display(){
        int i=0;
        Node temp=first;

        while(temp != null){
            System.out.println(temp.data);
            temp=temp.rptr;
        }
    }

}
public class Music_player{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Music playlist=new Music();
        playlist.insert_at_first("aaa");
        playlist.insert_at_first("bbb");
        playlist.insert_at_first("ccc");
        playlist.insert_at_first("ddd");
        playlist.insert_at_first("eee");
        playlist.display();

        playlist.currentSong();
        playlist.nextSong();
        playlist.previousSong();
        playlist.deleteSong();
        playlist.deletePerticular("ccc");
        playlist.display();

    }
}