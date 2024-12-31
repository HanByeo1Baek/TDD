package com.green.greengram.feed.model;

import lombok.Getter;

@Getter
//setter 메소드가 없어서 Reflection API 를 이용하여 데이터가 대입이 될건데
//이때 중요한게 객체 생성이 무조건 되어야 한다. 그래서 기본 생성자가 있어야 함.
public class FeedPicVo {
    private long feedId;
    private String pic;
    private String createdAt;

}
