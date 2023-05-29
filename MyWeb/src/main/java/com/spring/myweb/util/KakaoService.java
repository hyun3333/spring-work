package com.spring.myweb.util;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KakaoService {
    
    @Value("${kakao.clientId}")
    private String clientId;
    @Value("${kakao.clientSecret}")
    private String clientSecret;
    @Value("${kakao.redirectUri}")
    private String redirectUri;
    
    private String sessionState = "kakao_oauth_state";

    //카카오 아이디로 로그인 인증 url 생성
    public String getAuthorizationUrl(HttpSession session) {
        
        // 세션 유혀송 검증을 위하여 난수를 생성
        String state = UUID.randomUUID().toString();
        // 생성된 난수값을 session에 저장
        session.setAttribute(sessionState, state);
        
        String requestUrl = String.format("https://kauth.kakao.com/oauth/authorize?client_id=%s&redirect_uri=%s&response_type=code&state=%s", clientId, redirectUri, state);
    
        return requestUrl;
    }
    
}