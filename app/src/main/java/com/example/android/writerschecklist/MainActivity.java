package com.example.android.writerschecklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int calculatePoints() {

        //Find RadioButtons on XML
        RadioButton summaryYes = findViewById(R.id.summary_yes);
        RadioButton summaryNo = findViewById(R.id.summary_no);
        RadioButton promotionCommunity = findViewById(R.id.promotion_community);
        RadioButton promotionNone = findViewById(R.id.promotion_none);
        RadioButton promotionProfessional = findViewById(R.id.promotion_professional);
        RadioButton promotionSpam = findViewById(R.id.promotion_spam);
        RadioButton coverYes = findViewById(R.id.cover_yes);
        RadioButton coverNo = findViewById(R.id.cover_no);
        RadioButton editsEditor = findViewById(R.id.edits_editor);
        RadioButton editsMany = findViewById(R.id.edits_many);
        RadioButton editsNone = findViewById(R.id.edits_none);
        RadioButton editsOnce = findViewById(R.id.edits_once);
        RadioButton researchMinute = findViewById(R.id.research_minute);
        RadioButton commitmentMood = findViewById(R.id.commitment_mood);
        RadioButton commitmentOften = findViewById(R.id.commitment_often);
        RadioButton researchDay = findViewById(R.id.research_day);
        RadioButton researchYear = findViewById(R.id.research_year);
        RadioButton reasonFame = findViewById(R.id.reason_fame);
        RadioButton reasonHelp = findViewById(R.id.reason_help);
        RadioButton reasonNeed = findViewById(R.id.reason_need);

        //Find Checkboxes on XML
        CheckBox originalityCliches = findViewById(R.id.originality_cliches);
        CheckBox originalityFanfiction = findViewById(R.id.originality_fanfiction);
        CheckBox originalityMax = findViewById(R.id.originality_max);
        CheckBox originalitySimilar = findViewById(R.id.originality_similar);
        CheckBox coherenceFlow = findViewById(R.id.coherence_flow);
        CheckBox coherenceNone = findViewById(R.id.coherence_none);
        CheckBox coherenceRationality = findViewById(R.id.coherence_rationality);
        CheckBox coherenceLiveliness = findViewById(R.id.coherence_liveliness);

        //Find EditText on XML
        EditText punctuationPhrase = findViewById(R.id.punctuation_phrase);

        //EditText possible answers
        String phraseSubmitted = punctuationPhrase.getText().toString();
        String correctPhrase1 = getString(R.string.correct_phrase_one);
        String correctPhrase2 = getString(R.string.correct_phrase_two);
        phraseSubmitted = phraseSubmitted.trim();

        //Check answers and calculate points
        int successPoints = 0;

        if (phraseSubmitted.equals(correctPhrase1) || phraseSubmitted.equals(correctPhrase2)) {
            successPoints += 10;
        }
        if (summaryNo.isChecked()) successPoints += 10;
        if (promotionCommunity.isChecked()) successPoints += 10;
        if (promotionProfessional.isChecked()) successPoints += 10;
        if (coverYes.isChecked()) successPoints += 10;
        if (editsEditor.isChecked()) successPoints += 10;
        if (editsMany.isChecked()) successPoints += 10;
        if (commitmentOften.isChecked()) successPoints += 10;
        if (researchDay.isChecked()) successPoints += 10;
        if (originalityMax.isChecked()) successPoints += 10;
        if (reasonNeed.isChecked()) successPoints += 10;
        if (coherenceFlow.isChecked()) successPoints += 10;
        if (coherenceRationality.isChecked()) successPoints += 10;
        if (coherenceLiveliness.isChecked()) successPoints += 10;
        if (editsOnce.isChecked()) successPoints += 5;
        if (researchYear.isChecked()) successPoints += 5;
        if (originalityCliches.isChecked()) successPoints += 5;
        if (reasonHelp.isChecked()) successPoints += 5;
        if (summaryYes.isChecked()) successPoints += 0;
        if (promotionNone.isChecked()) successPoints += 0;
        if (promotionSpam.isChecked()) successPoints += 0;
        if (coverNo.isChecked()) successPoints += 0;
        if (editsNone.isChecked()) successPoints += 0;
        if (commitmentMood.isChecked()) successPoints += 0;
        if (researchMinute.isChecked()) successPoints += 0;
        if (originalityFanfiction.isChecked()) successPoints += 0;
        if (originalitySimilar.isChecked()) successPoints += 0;
        if (reasonFame.isChecked()) successPoints += 0;
        if (coherenceNone.isChecked()) successPoints += 0;

        return successPoints;
    }

    private int findPercentage() {
        int percentage = calculatePoints() * 100 / 125;
        return percentage;
    }

    public void displayResults() {

        //Find Answers Views on XML
        RadioButton summaryNo = findViewById(R.id.summary_no);
        RadioButton promotionCommunity = findViewById(R.id.promotion_community);
        RadioButton promotionProfessional = findViewById(R.id.promotion_professional);
        RadioButton coverYes = findViewById(R.id.cover_yes);
        RadioButton editsEditor = findViewById(R.id.edits_editor);
        RadioButton editsMany = findViewById(R.id.edits_many);
        EditText punctuationPhrase = findViewById(R.id.punctuation_phrase);
        RadioButton commitmentOften = findViewById(R.id.commitment_often);
        RadioButton researchDay = findViewById(R.id.research_day);
        CheckBox originalityCliches = findViewById(R.id.originality_cliches);
        CheckBox originalityMax = findViewById(R.id.originality_max);
        RadioButton reasonNeed = findViewById(R.id.reason_need);
        CheckBox coherenceFlow = findViewById(R.id.coherence_flow);
        CheckBox coherenceRationality = findViewById(R.id.coherence_rationality);
        CheckBox coherenceLiveliness = findViewById(R.id.coherence_liveliness);

        /// Find Results Views on XML
        LinearLayout resultsLayout = findViewById(R.id.results_layout);
        TextView score = findViewById(R.id.score);
        TextView tipsSummary = findViewById(R.id.tips_summary);
        TextView tipsCommunity = findViewById(R.id.tips_community);
        TextView tipsProfessional = findViewById(R.id.tips_professional);
        TextView tipsCover = findViewById(R.id.tips_cover);
        TextView tipsEditor = findViewById(R.id.tips_editor);
        TextView tipsEdits = findViewById(R.id.tips_edits);
        TextView tipsPunctuation = findViewById(R.id.tips_punctuation);
        TextView tipsFrequency = findViewById(R.id.tips_frequency);
        TextView tipsResearch = findViewById(R.id.tips_research);
        TextView tipsCliches = findViewById(R.id.tips_cliches);
        TextView tipsOriginality = findViewById(R.id.tips_originality);
        TextView tipsNeed = findViewById(R.id.tips_need);
        TextView tipsFlow = findViewById(R.id.tips_flow);
        TextView tipsRationality = findViewById(R.id.tips_rationality);
        TextView tipsLiveliness = findViewById(R.id.tips_liveliness);

        //EditText possible answers
        String phraseSubmitted = punctuationPhrase.getText().toString();
        String correctPhrase1 = getString(R.string.correct_phrase_one);
        String correctPhrase2 = getString(R.string.correct_phrase_two);
        phraseSubmitted = phraseSubmitted.trim();

        //Display appropriate score
        score.setText(String.format(getResources().getString(R.string.score), findPercentage()));

        //Display appropriate tips
        resultsLayout.setVisibility(View.VISIBLE);
        resultsLayout.requestFocus();

        if (summaryNo.isChecked()) {
            tipsSummary.setVisibility(View.GONE);
        } else {
            tipsSummary.setVisibility(View.VISIBLE);
        }
        if (promotionCommunity.isChecked()) {
            tipsCommunity.setVisibility(View.GONE);
        } else {
            tipsCommunity.setVisibility(View.VISIBLE);
        }
        if (promotionProfessional.isChecked()) {
            tipsProfessional.setVisibility(View.GONE);
        } else {
            tipsProfessional.setVisibility(View.VISIBLE);
        }
        if (coverYes.isChecked()) {
            tipsCover.setVisibility(View.GONE);
        } else {
            tipsCover.setVisibility(View.VISIBLE);
        }
        if (editsEditor.isChecked()) {
            tipsEditor.setVisibility(View.GONE);
        } else {
            tipsEditor.setVisibility(View.VISIBLE);
        }
        if (editsMany.isChecked()) {
            tipsEdits.setVisibility(View.GONE);
        } else {
            tipsEdits.setVisibility(View.VISIBLE);
        }
        if (phraseSubmitted.equals(correctPhrase1) || phraseSubmitted.equals(correctPhrase2)) {
            tipsPunctuation.setVisibility(View.GONE);
        } else {
            tipsPunctuation.setVisibility(View.VISIBLE);
        }
        if (commitmentOften.isChecked()) {
            tipsFrequency.setVisibility(View.GONE);
        } else {
            tipsFrequency.setVisibility(View.VISIBLE);
        }
        if (researchDay.isChecked()) {
            tipsResearch.setVisibility(View.GONE);
        } else {
            tipsResearch.setVisibility(View.VISIBLE);
        }
        if (originalityCliches.isChecked()) {
            tipsCliches.setVisibility(View.GONE);
        } else {
            tipsCliches.setVisibility(View.VISIBLE);
        }
        if (originalityMax.isChecked()) {
            tipsOriginality.setVisibility(View.GONE);
        } else {
            tipsOriginality.setVisibility(View.VISIBLE);
        }
        if (reasonNeed.isChecked()) {
            tipsNeed.setVisibility(View.GONE);
        } else {
            tipsNeed.setVisibility(View.VISIBLE);
        }
        if (coherenceFlow.isChecked()) {
            tipsFlow.setVisibility(View.GONE);
        } else {
            tipsFlow.setVisibility(View.VISIBLE);
        }
        if (coherenceRationality.isChecked()) {
            tipsRationality.setVisibility(View.GONE);
        } else {
            tipsRationality.setVisibility(View.VISIBLE);
        }
        if (coherenceLiveliness.isChecked()) {
            tipsLiveliness.setVisibility(View.GONE);
        } else {
            tipsLiveliness.setVisibility(View.VISIBLE);
        }
    }

    public boolean checkUnanswered() {

        //Find RadioButtons on XML
        RadioButton summaryYes = findViewById(R.id.summary_yes);
        RadioButton summaryNo = findViewById(R.id.summary_no);
        RadioButton promotionCommunity = findViewById(R.id.promotion_community);
        RadioButton promotionNone = findViewById(R.id.promotion_none);
        RadioButton promotionProfessional = findViewById(R.id.promotion_professional);
        RadioButton promotionSpam = findViewById(R.id.promotion_spam);
        RadioButton coverYes = findViewById(R.id.cover_yes);
        RadioButton coverNo = findViewById(R.id.cover_no);
        RadioButton editsEditor = findViewById(R.id.edits_editor);
        RadioButton editsMany = findViewById(R.id.edits_many);
        RadioButton editsNone = findViewById(R.id.edits_none);
        RadioButton editsOnce = findViewById(R.id.edits_once);
        RadioButton researchMinute = findViewById(R.id.research_minute);
        RadioButton commitmentMood = findViewById(R.id.commitment_mood);
        RadioButton commitmentOften = findViewById(R.id.commitment_often);
        RadioButton researchDay = findViewById(R.id.research_day);
        RadioButton researchYear = findViewById(R.id.research_year);
        RadioButton reasonFame = findViewById(R.id.reason_fame);
        RadioButton reasonHelp = findViewById(R.id.reason_help);
        RadioButton reasonNeed = findViewById(R.id.reason_need);

        //Find Checkboxes on XML
        CheckBox originalityCliches = findViewById(R.id.originality_cliches);
        CheckBox originalityFanfiction = findViewById(R.id.originality_fanfiction);
        CheckBox originalityMax = findViewById(R.id.originality_max);
        CheckBox originalitySimilar = findViewById(R.id.originality_similar);
        CheckBox coherenceFlow = findViewById(R.id.coherence_flow);
        CheckBox coherenceNone = findViewById(R.id.coherence_none);
        CheckBox coherenceRationality = findViewById(R.id.coherence_rationality);
        CheckBox coherenceLiveliness = findViewById(R.id.coherence_liveliness);

        //Find EditText on XML and convert to String
        EditText punctuationPhrase = findViewById(R.id.punctuation_phrase);
        String phraseSubmitted = punctuationPhrase.getText().toString();

        //Check if each question has at least one answer
        boolean question1;
        boolean question2;
        boolean question3;
        boolean question4;
        boolean question5;
        boolean question6;
        boolean question7;
        boolean question8;
        boolean question9;
        boolean question10;

        if (summaryYes.isChecked() || summaryNo.isChecked()) {
            question1 = true;
        } else {
            question1 = false;
        }
        if (promotionCommunity.isChecked() || promotionNone.isChecked()
                || promotionProfessional.isChecked() || promotionSpam.isChecked()) {
            question2 = true;
        } else {
            question2 = false;
        }
        if (coverYes.isChecked() || coverNo.isChecked()) {
            question3 = true;
        } else {
            question3 = false;
        }
        if (editsEditor.isChecked() || editsMany.isChecked()
                || editsNone.isChecked() || editsOnce.isChecked()) {
            question4 = true;
        } else {
            question4 = false;
        }
        if (phraseSubmitted.isEmpty()) {
            question5 = false;
        } else {
            question5 = true;
        }
        if (commitmentMood.isChecked() || commitmentOften.isChecked()) {
            question6 = true;
        } else {
            question6 = false;
        }
        if (researchMinute.isChecked() || researchDay.isChecked() || researchYear.isChecked()) {
            question7 = true;
        } else {
            question7 = false;
        }
        if (originalityCliches.isChecked() || originalityFanfiction.isChecked()
                || originalityMax.isChecked() || originalitySimilar.isChecked()) {
            question8 = true;
        } else {
            question8 = false;
        }
        if (reasonFame.isChecked() || reasonHelp.isChecked() || reasonNeed.isChecked()) {
            question9 = true;
        } else {
            question9 = false;
        }
        if (coherenceFlow.isChecked() || coherenceNone.isChecked()
                || coherenceLiveliness.isChecked() || coherenceRationality.isChecked()) {
            question10 = true;
        } else {
            question10 = false;
        }

        //Create a boolean to check all questions at once
        boolean hasUnanswered;

        if (question1 && question2 && question3 && question4 && question5
                && question6 && question7 && question8 && question9 && question10) {
            hasUnanswered = false;
        } else {
            hasUnanswered = true;
        }

        return hasUnanswered;
    }

    public void submitAnswers(View view) {
        if (checkUnanswered()) {
            Toast.makeText(this, getString(R.string.unanswered_questions), Toast.LENGTH_SHORT).show();
        } else {
            calculatePoints();
            displayResults();
            Toast.makeText(this, String.format(getResources().getString(R.string.score), findPercentage()), Toast.LENGTH_SHORT).show();
        }
    }
}