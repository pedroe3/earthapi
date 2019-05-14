package com.sadcrow.earthquake.helpers;


import com.sadcrow.earthquake.dto.readServiceDto.MainRequestDtoUSCG;
import com.sadcrow.earthquake.enums.FORMAT;
import com.sadcrow.earthquake.enums.URL;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class WebServices {

    private RestTemplate restTemplate = new RestTemplate();

    public MainRequestDtoUSCG getUscgInfo(String dateFrom) {
        MainRequestDtoUSCG data = new MainRequestDtoUSCG();
        String url = URL.UscgApi.getUrl() + "query?format=" + FORMAT.geojson + "&starttime=" + dateFrom;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<MainRequestDtoUSCG> entity = new HttpEntity<MainRequestDtoUSCG>(data,headers);

        return restTemplate.exchange(url, HttpMethod.GET, entity, MainRequestDtoUSCG.class).getBody();
    }

}


