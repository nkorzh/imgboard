<#import "common/common.ftlh" as c>
<#import "footer.ftlh" as f>

<@c.page>
<div id="newpost_form">
    <form class="newpost-block">
        <input class="title-block" id="post_title" type="text" name="title" placeholder="Enter post title" required minlength="4" maxlength="30"/>

        <input class="name-block" id="post_author" type="text" name="author" placeholder="Enter your name" maxlength="50"/>
        <textarea class="textarea" cols="30" id="post_text" type="text" name="content" placeholder="Write your post" required></textarea>
        <button class="post-button" type="submit" formmethod="post">Post!</button>
    </form>
</div>

<@f.footer footer />
</@c.page>