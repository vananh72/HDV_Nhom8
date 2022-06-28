package com.example.task.service;

import com.example.task.api.CallIPI;
import com.example.task.model.Book;
import com.example.task.model.Orders;
import com.example.task.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CallIPI callAPI;

    @Override
    public String submitForm(int id_user, int id_book) {

        User user = callAPI.getUserByID(id_user);
        Book book = callAPI.getBookByID(id_book);

        if (user == null || book == null) {
            return "Kiểm tra lại user và book";
        }else {
            Orders orders1 = new Orders();
            orders1.setBook(book);
            orders1.setUser(user);
            Orders o2 = callAPI.saveOrders(orders1);
            String s = callAPI.sendMail(orders1);
            return "user: "+ o2.getUser().getName()+ " đã mua thành công sách: "+o2.getBook().getName();
        }


    }
}
