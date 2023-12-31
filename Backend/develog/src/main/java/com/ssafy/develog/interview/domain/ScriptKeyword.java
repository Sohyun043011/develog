package com.ssafy.develog.interview.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScriptKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scriptKeywordId;

    private String keyword;

    @JoinColumn(name = "prediction_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Prediction prediction;

    public static ScriptKeyword makeScriptKeyword(Prediction prediction, String keyword) {
        ScriptKeyword scriptKeyword = new ScriptKeyword();

        scriptKeyword.keyword = keyword;
        scriptKeyword.prediction = prediction;

        return scriptKeyword;
    }
}
