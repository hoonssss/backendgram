package com.sparta.backendgram.profile.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements ErrorCode {
    REJECTED_USER_EXECUTION(HttpStatus.FORBIDDEN, "작성자만 수정 가능"),
    NON_PROFILE_EXSIST(HttpStatus.NOT_FOUND, "프로필이 존재하지 않음"),
    ALREADY_EXSIST_USER(HttpStatus.FORBIDDEN, "이미 존재하는 사용자"),
    PASSWORD_IS_NOT_MATCH(HttpStatus.FORBIDDEN, "비밀번호가 일치하지 않음");
    private final HttpStatus httpStatus;
    private final String message;
}