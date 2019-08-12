package com.murmuler.organicstack.dao;

import com.murmuler.organicstack.vo.*;

import java.util.List;
import java.util.Map;

public interface RoomDAO {
    List<RoomSummaryVO> selectRoomSummaryByLocation(Map<String, Object> map);
    RoomDetailVO selectRoomDetailByRoomId(Map<String, Integer> map);
    List<Integer> selectRoomOptionByRoomId(Map<String, Integer> map);
    List<Integer> selectRoomManageByRoomId(Map<String, Integer> map);
    List<String> selectRoomHashtagByRoomId(Map<String, Integer> map);
    List<String> selectRoomImgUrlByRoomId(Map<String, Integer> map);
    List<RoomSummaryVO> selectMyRooms(int id);
    List<RoomSummaryVO> selectRoomByRoomIds(List<Integer> ids);
    List<RoomSummaryVO> selectRoomByLikes(Map<String, Integer> map);
    Map<String, Object> selectRoomInfo(int roomId);
    int selectLocationIdByRoomId(int roomId);
    int insertRoom(LocationVO locationVO, RoomVO roomVO, SaleInfoVO saleInfoVO);
    int insertRoomManageCost(int roomId, int[] manageIdList);
    int insertRoomOption(int roomId, int[] optionIdList);
    int insertRoomHashtag(int roomId, String[] hashtagList);
    int insertRoomImage(int roomId, String[] imgUrlList);
    int updateRoom(LocationVO locationVO, RoomVO roomVO, SaleInfoVO saleInfoVO, String isNotChangeAddr, String isNotChangeDtAddr);
    int updateViews(Map<String, Integer> map);
    int updatePostType(Map<String, Integer> paramMap);
    int deleteManageCost(int roomId, int[] manageIdList);
    int deleteOption(int roomId, int[] optionIdList) ;
    int deleteHashtag(int roomId, String[] hashtagList) ;
    int deleteRoomImage(int roomId, String[] imgUrlList) ;
    int deleteRoom(int roomId);
}
