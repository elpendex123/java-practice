package com.coello;

import java.util.ArrayList;

public class MyList {
    public ArrayList<Integer> myList;
    public String listName;

    public MyList(String listName) {
        this.listName = listName;
    }

    public MyList(String listName, ArrayList<Integer> myList) {
        this.myList = myList;
        this.listName = listName;
    }

    public ArrayList<Integer> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Integer> myList) {
        this.myList = myList;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void add(Integer value) {
        if (myList == null)
            myList = new ArrayList<>();

        myList.add(value);
    }

    @Override
    public String toString() {
        return "\nMyList {listName = " + listName + ", myList = " + myList +  "}";
    }

    public boolean equals(MyList other) {
        if (!this.listName.equals(other.listName))
            return false;

        if (this.myList.size() != other.myList.size())
            return false;

        for (int i = 0; i < this.myList.size(); i++)
        {
            if (this.myList.get(i) != other.myList.get(i))
                return false;
        }

        return true;
    }
}
