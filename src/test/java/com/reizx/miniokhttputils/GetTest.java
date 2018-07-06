package com.reizx.miniokhttputils;

import com.zhy.http.okhttp.OkHttpUtils;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

public class GetTest {
    @Test
    public void getTest() throws IOException {
        Response response = OkHttpUtils
                .get()
                .url("http://2018.ip138.com/ic.asp")
                .build()
                .execute();
        System.out.println("the respon : "  + response);
    }
}
