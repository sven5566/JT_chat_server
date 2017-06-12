package com.whr.jt.chat.server.bean.db;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by whrr5 on 2017/6/12.
 */
@Entity
@Table(name="TB_GROUP_MEMBER")
public class GroupMember {
    public static final int PERMISSION_TYPE_NONE=0;//默认权限，普通成员
    public static final int PERMISSION_TYPE_ADMIN=1;//管理员
    public static final int PERMISSION_TYPE_ADMIN_SU=100;//创建者

    public static final int NOTIFY_LEVER_INVALIED=-1;//默认不接受消息
    public static final int NOTIFY_LEVER_NONE =0;//默认通知级别
    public static final int NOTIFY_LEVER_CLOSE=1;//接受消息不提示


    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(updatable = false,nullable = false)
    private String id;

    @Column
    private String alias;

    @Column(nullable = false)
    private int notifyLevel= NOTIFY_LEVER_NONE;

    private int permissionType=PERMISSION_TYPE_NONE;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime creatAt=LocalDateTime.now();

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime updateAt=LocalDateTime.now();

    @JoinColumn(name = "userId")
    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private User user;
    @Column(nullable = false,updatable = false,insertable = false)
    private String userId;

    @JoinColumn(name = "groupId")
    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Group group;
    @Column(nullable = false,updatable = false,insertable = false)
    private String groupId;
}
