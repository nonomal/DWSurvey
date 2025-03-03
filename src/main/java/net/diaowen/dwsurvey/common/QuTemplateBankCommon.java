package net.diaowen.dwsurvey.common;

import net.diaowen.common.QuType;
import net.diaowen.dwsurvey.entity.*;

import java.util.ArrayList;
import java.util.List;

public class QuTemplateBankCommon {

    public static Question getUploadQuestion() {
        return new Question(QuType.UPLOADFILE, "上传题标题", "上传题", "<i class=\"fa-solid fa-cloud-arrow-up\"></i>");
    }

    public static Question getTextareaQuestion() {
        Question textareaQuestion = new Question(QuType.FILLBLANK, "多行填空题标题", "多行填空题", "<i class=\"fa-regular fa-rectangle-list\"></i>");
        textareaQuestion.setAnswerInputRow(3);
        return textareaQuestion;
    }

    public static Question getSelectQuestion() {
        Question selectQuestion = new Question(QuType.RADIO, "下拉题标题", "下拉题", "<i class=\"fa-regular fa-circle-check\"></i>");
        selectQuestion.setHv(4);
        List<QuRadio> selectQuRadios = new ArrayList<>();
        selectQuRadios.add(new QuRadio("选项1","选项1"));
        selectQuRadios.add(new QuRadio("选项2", "选项2"));
        selectQuestion.setQuRadios(selectQuRadios);
        return selectQuestion;
    }

    public static Question getOrderQuestion() {
        Question orderQuestion = new Question(QuType.ORDERQU, "排序题标题", "排序题", "<i class=\"fa-solid fa-arrow-down-1-9\"></i>");
        List<QuOrderby> quOrderbys = new ArrayList<>();
        quOrderbys.add(new QuOrderby("选项1","选项1"));
        quOrderbys.add(new QuOrderby("选项2", "选项2"));
        orderQuestion.setQuOrderbys(quOrderbys);
        return orderQuestion;
    }

    public static Question getScoreQuestion() {
        Question scoreQuestion = new Question(QuType.SCORE, "评分题标题", "评分题", "<i class=\"fa-solid fa-star\"></i>");
        scoreQuestion.setParamInt02(5);
        List<QuScore> quScores = new ArrayList<>();
        quScores.add(new QuScore("选项1","选项1"));
        quScores.add(new QuScore("选项2", "选项2"));
        scoreQuestion.setQuScores(quScores);
        return scoreQuestion;
    }

    public static Question getmFbkQuestion() {
        Question mFbkQuestion = new Question(QuType.MULTIFILLBLANK, "多项填空题标题", "多项填空题", "<i class=\"fa-solid fa-list-check\"></i>");
        List<QuMultiFillblank> quMultiFillblanks = new ArrayList<>();
        quMultiFillblanks.add(new QuMultiFillblank("选项1","选项1"));
        quMultiFillblanks.add(new QuMultiFillblank("选项2", "选项2"));
        mFbkQuestion.setQuMultiFillblanks(quMultiFillblanks);
        return mFbkQuestion;
    }

    public static Question getInputQuestion() {
        return new Question(QuType.FILLBLANK, "填空题标题", "填空题", "<i class=\"fa-solid fa-font\"></i>");
    }

    public static Question getCheckboxQuestion() {
        Question checkboxQuestion = new Question(QuType.CHECKBOX, "多选题标题", "多选题");
        List<QuCheckbox> quCheckboxs = new ArrayList<>();
        quCheckboxs.add(new QuCheckbox("选项1","选项1"));
        quCheckboxs.add(new QuCheckbox("选项2", "选项2"));
        checkboxQuestion.setQuCheckboxs(quCheckboxs);
        checkboxQuestion.setDwQuIcon("<i class=\"fa-regular fa-square-check\"></i>");
        return checkboxQuestion;
    }

    public static Question getRadioQuestion() {
        Question radioQuestion = new Question(QuType.RADIO, "单选题标题", "单选题");
        List<QuRadio> quRadios = new ArrayList<>();
        quRadios.add(new QuRadio("选项1","选项1"));
        quRadios.add(new QuRadio("选项2", "选项2"));
        radioQuestion.setQuRadios(quRadios);
        return radioQuestion;
    }

    public static Question getSignatureQuestion() {
        Question qu = new Question(QuType.SIGNATURE, "请在下方完成签名", "签名题", "<i class=\"fa-solid fa-file-signature\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-qianming");
        return qu;
    }

    public static Question getImgRadio() {
        Question qu = new Question(QuType.IMGRADIO, "请选择图片", "图片单选题", "<i class=\"fa-regular fa-image\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-tupiandanxuan");
        return qu;
    }

    public static Question getImgCheckbox() {
        Question qu = new Question(QuType.IMGCHECKBOX, "请选择图片", "图片多选题", "<i class=\"fa-regular fa-images\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-tupianduoxuan");
        return qu;
    }

    public static Question getGeolocation() {
        Question qu= new Question(QuType.GEOLOCATION, "请点击定位按钮完成定位", "定位题", "<i class=\"fa-solid fa-location-dot\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-dizhi");
        return qu;
    }

    public static Question getImageHot() {
        Question qu = new Question(QuType.IMAGE_HOT, "请点击图片任意区域", "热点题", "<i class=\"fa-solid fa-arrows-to-eye\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }

    public static Question getUploadImage() {
        Question qu = new Question(QuType.UPLOAD_IMAGE, "请上传图片", "图片上传题", "<i class=\"fa-solid fa-cloud-arrow-up\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }

    public static Question getColorPicker() {
        Question qu = new Question(QuType.COLOR_PICKER, "请选择颜色", "颜色题", "<i class=\"fa-solid fa-palette\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }


    // 显示组件
    public static Question getDivider() {
        Question qu = new Question(QuType.DIVIDER, "", "分割线", "<i class=\"fa-regular fa-file-lines\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }

    public static Question getCarousel() {
        Question qu = new Question(QuType.CAROUSEL, "", "轮播图", "<i class=\"fa-solid fa-photo-film\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }

    public static Question getMap() {
        Question qu = new Question(QuType.MAP, "", "地图组件", "<i class=\"fa-solid fa-map-location-dot\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }


    public static Question getMatrixAutoAdd() {
        Question qu = new Question(QuType.MATRIX_AUTO_ADD, "矩阵自增题", "矩阵自增题", "<i class=\"fa-solid fa-plus-minus\"></i>");
        qu.setDwsurveyfont("icon-dwsurvey-riqi");
        return qu;
    }


}
