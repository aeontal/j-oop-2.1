package domain;

import manager.CommentManager;
import manager.LikedManager;
import manager.SharedManager;

import java.util.Date;

public class Post {
    // идентификатор поста
    private int id;
    //Вызов информации о пользователе
    private User user;
    //сохранен ли в закладках;
    private boolean isFavored;
    // есть ли жалоба на пост;
    private boolean isComplain;
    // есть ли подписка на пользователя
    private boolean isSuscribed;

    //возможность оставлять комментарии
    private boolean canPost;
    //дата поста
    private Date postDate;
    //текст поста
    private String PostText;

    //+ поле для вложения/ссылки

    // вытаскиваем инфу по комментам
    private CommentManager comment;
    // возможные действия с постом в ленте;
    private Utils utils;
    // менеджер для хранения лайков;
    private LikedManager likedManager;
    // менеджер для хранения репостов;
    private SharedManager sharedManager;

    //+ get/set методы на все поля

}
