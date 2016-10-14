package com.cn.coreJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moon on 16/10/13.
 */
public class CoreJavaDemo4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Song> songs = new ArrayList<Song>();
        songs.add(new Song("花好月圆",""));
        songs.add(new Song("传奇",""));
        songs.add(0,new Song("伤不起",""));
        for(Song song:songs){
            System.out.println(song.name);
        }

        System.out.println(songs);
    }

}
class Song{
    String name;
    String fileName;

    public Song(String name) {
        this.name = name;
    }

    public Song(String name, String fileName) {
        this.name = name;
        this.fileName = fileName;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
