package cn.itcast.core.pojo;

/**
 * Copyright (C), 2006-2010, Computer Technology info. Co., Ltd.
 * 
 * �ͻ�һ��ҳ����ۺϲ�ѯ����vo
 * 
 * @author Derek Sun
 * @version 1.00
 *
 */
public class QueryVo {

	private String custName;   // �ͻ�����
	private String custSource;   // �ͻ���Դ
	private String custIndustry;   // �ͻ�������ҵ
	private String custLevel;   // �ͻ�����
	private Integer page = 1;   // ��ҳ��ʼҳ��
	private Integer start;   // ��ǰҳ�Ŀ�ʼ�к�
	private Integer size = 10;   // Ĭ��ÿҳ��ʾ�ļ�¼��


	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
}
