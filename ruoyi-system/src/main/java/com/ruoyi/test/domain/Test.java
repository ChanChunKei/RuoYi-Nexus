package com.ruoyi.test.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * test对象 test
 *
 * @author ruoyi
 */
@TableName( resultMap = "com.ruoyi.test.mapper.TestMapper.TestResult" )
public class Test extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /** id */
    @TableId( value = "id", type = IdType.AUTO )
    private Long id;
    
    /** 姓名 */
    @Excel( name = "姓名" )
    private String name;
    
    /** 内容 */
    @Excel( name = "内容" )
    private String text;
    
    /** 金额 */
    @Excel( name = "金额" )
    private BigDecimal amount;
    
    /** 时间 */
    @JsonFormat( pattern = "yyyy-MM-dd" )
    @Excel( name = "时间", width = 30, dateFormat = "yyyy-MM-dd" )
    private Date date;
    
    public void setId( Long id ) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setText( String text ) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    public void setAmount( BigDecimal amount ) {
        this.amount = amount;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public void setDate( Date date ) {
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                       .append("id", getId())
                       .append("name", getName())
                       .append("text", getText())
                       .append("amount", getAmount())
                       .append("date", getDate())
                       .toString();
    }
}