package com.guestbook.repositories;

import com.guestbook.models.GuestBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestBookRepository {

    List<GuestBook> guestBookList = new ArrayList<>();
    private Integer currentId = 0;

    public Integer save(String name, String comment) {
        currentId += 1;
        GuestBook guestBook = new GuestBook(currentId, new Date(), name, comment);
        guestBookList.add(guestBook);
        return currentId;
    }

    public List<GuestBook> get() {
        return guestBookList;
    }

    public Object get(Integer id) {
        return null;
    }

    public void delete(Integer id) {

    }
}
