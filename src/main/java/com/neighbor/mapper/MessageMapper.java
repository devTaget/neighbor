package com.neighbor.mapper;

import com.neighbor.domain.dto.Criteria;
import com.neighbor.domain.dto.MessageDTO;
import com.neighbor.domain.dto.MessageRoomDTO;
import com.neighbor.domain.vo.MemberVO;
import com.neighbor.domain.vo.MessageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

//    <!-- 내가 보낸 쪽지 전체 -->
    public List<MessageRoomDTO> selectAll(Long memberId);

//    <!-- 해당 게시글의 쪽지 내역-->
    public List<MessageVO> selectMessage(Long messageRoomId, Criteria criteria);

//    <!-- 전체 쪽지 개수 -->
    public Integer selectCountList(Long memberId);

//    <!-- 쪽지 대화 내용 개수 -->
    public Integer selectCountMessage(Long messageRoomId);

//    <!-- 쪽지 대화 내역 중 가장 최근 날짜 -->
    public String selectLatestDate(Long messageRoomId);

//    <!-- 대화방 번호 가져오기 -->
    public Long selectMessageRoomId(Long customerId, Long boardId);

//    <!-- 쪽지 상대방 정보 가져오기 -->
    public MemberVO selectTargetInfo(Long memberId);

//    <!--  쪽지 입력  -->
    public void insertMessageVO(MessageVO messageVO);

//    <!--  쪽지방 생성  -->
    public void insertMessageRoomVO(Long boardId, Long sellerId, Long customerId);

//    <!--  작성 게시물 수  -->
    public Integer selectCountBoard(Long memberId);

//    <!--  작성 후기 수  -->
    public Integer selectCountReply(Long memberId);



}
