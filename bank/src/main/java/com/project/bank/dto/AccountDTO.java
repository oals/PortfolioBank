package com.project.bank.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.bank.entity.Member;
import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountDTO {

    private String accountNumber;       // 계좌 번호
    private String accountName;
    private String accountPswd;
    private LocalDateTime createDate;   // 생성 일자
    private int balance;

    @JsonIgnore
    private Member member;            // 회원 아이디   -> 삭제 할수도




}
