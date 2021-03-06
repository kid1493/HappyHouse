package com.ssafy.vue.model;

import java.util.List;

public class PageDto {
	private int pageno;
	private int count;
	private int start;
	private int end;
	private int prev;
	private int next;
	private int startPageNum;
	private int endPageNum;
	private List<BoardDto> blist;
	private List<HouseInfoDto> hlist;
	private List<CommentDto> clist;
	
	public PageDto(int pageno, int count, int start, int end, int prev, int next, int startPageNum, int endPageNum) {
		super();
		this.pageno = pageno;
		this.count = count;
		this.start = start;
		this.end = end;
		this.prev = prev;
		this.next = next;
		this.startPageNum = startPageNum;
		this.endPageNum = endPageNum;
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}

	public List<BoardDto> getBlist() {
		return blist;
	}

	public void setBlist(List<BoardDto> blist) {
		this.blist = blist;
	}

	public List<HouseInfoDto> getHlist() {
		return hlist;
	}

	public void setHlist(List<HouseInfoDto> hlist) {
		this.hlist = hlist;
	}

	public List<CommentDto> getClist() {
		return clist;
	}

	public void setClist(List<CommentDto> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "PageDto [pageno=" + pageno + ", count=" + count + ", start=" + start + ", end=" + end + ", prev=" + prev
				+ ", next=" + next + ", startPageNum=" + startPageNum + ", endPageNum=" + endPageNum + ", blist="
				+ blist + ", hlist=" + hlist + ", clist=" + clist + "]";
	}
	
}