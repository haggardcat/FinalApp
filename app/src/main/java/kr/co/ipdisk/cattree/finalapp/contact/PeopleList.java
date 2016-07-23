package kr.co.ipdisk.cattree.finalapp.contact;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-23.
 */
public class People_List {
    public static ArrayList<People> getList() {
        ArrayList<People> list = new ArrayList<People>();
        String[][] peoples = {
                {"컵케이크", "c@test.com","010-2874-8253", "1"},
                {"도넛", "d@test.com", "010-2874-8253", "2"},
                {"이클레어", "e@test.com", "010-2874-8253", "3"},
                {"프로요", "p@test.com", "010-2874-8253", "4"},
                {"진저", "j@test.com", "010-2874-8253", "5"},
                {"허니컴", "h@test.com", "010-2874-8253", "6"},
                {"아이스크림", "i@test.com", "010-2874-8253", "7"},
                {"젤리빈", "j@test.com", "010-2874-8253", "8"},
                {"키켓", "k@test.com", "010-2874-8253", "9"},
                {"롤리팝", "l@test.com", "010-2874-8253", "10"}
        };
        for(int i=0;i<peoples.length;i++) {
            People people = new People();
            int j = 0;

            people.setName(peoples[i] [j]);
            j++;
            people.setEmail(peoples[i][j]);
            j++;
            people.setPhoneNo(peoples[i][j]);
            j++;
            people.setPhoto(Integer.parseInt(peoples[i][j]));

            list.add(people);
        }
        return list;
    }
}
