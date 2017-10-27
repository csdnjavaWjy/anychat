package org.anychat.model.base;

import java.io.Serializable;
import java.util.Date;

public class ChatGroupUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_group_user.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_group_user.chat_group_id
     *
     * @mbg.generated
     */
    private String chatGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_group_user.chat_group_user_real_name
     *
     * @mbg.generated
     */
    private String chatGroupUserRealName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_group_user.chat_group_user_role
     *
     * @mbg.generated
     */
    private Byte chatGroupUserRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_group_user.chat_group_user_update_time
     *
     * @mbg.generated
     */
    private Date chatGroupUserUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chat_group_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_group_user.user_id
     *
     * @return the value of chat_group_user.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_group_user.user_id
     *
     * @param userId the value for chat_group_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_group_user.chat_group_id
     *
     * @return the value of chat_group_user.chat_group_id
     *
     * @mbg.generated
     */
    public String getChatGroupId() {
        return chatGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_group_user.chat_group_id
     *
     * @param chatGroupId the value for chat_group_user.chat_group_id
     *
     * @mbg.generated
     */
    public void setChatGroupId(String chatGroupId) {
        this.chatGroupId = chatGroupId == null ? null : chatGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_group_user.chat_group_user_real_name
     *
     * @return the value of chat_group_user.chat_group_user_real_name
     *
     * @mbg.generated
     */
    public String getChatGroupUserRealName() {
        return chatGroupUserRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_group_user.chat_group_user_real_name
     *
     * @param chatGroupUserRealName the value for chat_group_user.chat_group_user_real_name
     *
     * @mbg.generated
     */
    public void setChatGroupUserRealName(String chatGroupUserRealName) {
        this.chatGroupUserRealName = chatGroupUserRealName == null ? null : chatGroupUserRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_group_user.chat_group_user_role
     *
     * @return the value of chat_group_user.chat_group_user_role
     *
     * @mbg.generated
     */
    public Byte getChatGroupUserRole() {
        return chatGroupUserRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_group_user.chat_group_user_role
     *
     * @param chatGroupUserRole the value for chat_group_user.chat_group_user_role
     *
     * @mbg.generated
     */
    public void setChatGroupUserRole(Byte chatGroupUserRole) {
        this.chatGroupUserRole = chatGroupUserRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_group_user.chat_group_user_update_time
     *
     * @return the value of chat_group_user.chat_group_user_update_time
     *
     * @mbg.generated
     */
    public Date getChatGroupUserUpdateTime() {
        return chatGroupUserUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_group_user.chat_group_user_update_time
     *
     * @param chatGroupUserUpdateTime the value for chat_group_user.chat_group_user_update_time
     *
     * @mbg.generated
     */
    public void setChatGroupUserUpdateTime(Date chatGroupUserUpdateTime) {
        this.chatGroupUserUpdateTime = chatGroupUserUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat_group_user
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChatGroupUser other = (ChatGroupUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getChatGroupId() == null ? other.getChatGroupId() == null : this.getChatGroupId().equals(other.getChatGroupId()))
            && (this.getChatGroupUserRealName() == null ? other.getChatGroupUserRealName() == null : this.getChatGroupUserRealName().equals(other.getChatGroupUserRealName()))
            && (this.getChatGroupUserRole() == null ? other.getChatGroupUserRole() == null : this.getChatGroupUserRole().equals(other.getChatGroupUserRole()))
            && (this.getChatGroupUserUpdateTime() == null ? other.getChatGroupUserUpdateTime() == null : this.getChatGroupUserUpdateTime().equals(other.getChatGroupUserUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat_group_user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getChatGroupId() == null) ? 0 : getChatGroupId().hashCode());
        result = prime * result + ((getChatGroupUserRealName() == null) ? 0 : getChatGroupUserRealName().hashCode());
        result = prime * result + ((getChatGroupUserRole() == null) ? 0 : getChatGroupUserRole().hashCode());
        result = prime * result + ((getChatGroupUserUpdateTime() == null) ? 0 : getChatGroupUserUpdateTime().hashCode());
        return result;
    }
}