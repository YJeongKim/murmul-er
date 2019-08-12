package com.murmuler.organicstack.dao;

import com.murmuler.organicstack.vo.LocationVO;
import com.murmuler.organicstack.vo.ReviewVO;

import java.util.ArrayList;
import java.util.List;

public interface ReviewDAO {
    List<ReviewVO> searchReviewList(int page);
    int searchReviewButtonCnt();
    int insertLocation(LocationVO locationVO);
    int insertReview(ReviewVO reviewVO);
    int searchReviewTotalCnt();
    int insertReviewHashtag(int roomId, ArrayList<String> hashtagList);
    List<String> serachHashTag(int reviewId);
}