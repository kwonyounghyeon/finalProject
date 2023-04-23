package com.hereo.project.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.hereo.project.vo.BoardCategoryVO;
import com.hereo.project.vo.BoardTypeVO;
import com.hereo.project.vo.BoardVO;
import com.hereo.project.vo.MembersVO;

public interface BoardDAO {

	ArrayList<BoardTypeVO> selectBoardType(@Param("auth")int me_siteauth);

	ArrayList<BoardTypeVO> selectAllBoardType();

	ArrayList<BoardCategoryVO> selectBoardCategoryRegion(@Param("bt_num")int bt_num);

	ArrayList<BoardCategoryVO> selectBoardCategoryName(@Param("bt_num")int bt_num);

	ArrayList<BoardVO> selectBoard(@Param("bt_num") int bt_num);

	BoardTypeVO getBoardTypeBtNum(@Param("bt_num") int bt_num);

	void enrollBoard(@Param("bo") BoardVO board);

	BoardVO selectBoardDetail(@Param("bo_num") int bo_num);

	void updateBoardViews(int bo_num);

	void updateBoard(@Param("bo") BoardVO board);

	Object deleteBoard(@Param("bo") BoardVO board, MembersVO user);



}
