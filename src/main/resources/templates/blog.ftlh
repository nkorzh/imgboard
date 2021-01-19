<#import "common/common.ftlh" as c>
<#import "common/pager.ftlh" as p>
<#import "footer.ftlh" as f>
<@c.page>


<div>
    <button class="newpost-button" id="newpost_button" onclick="window.location.assign('/newpost');">New post</button>
</div>
<@p.pager url page/>

<div>
    <#list articles as article>
        <div class="article-delimeter"></div>
        <div class="article-box">
            <div class="article-meta">By <strong>${article.author}</strong>, on <strong>${article.date}</strong></div>
            <div class="article-title-box">
                <a class="article-title" href="/article/${article.id}">${article.title}</a>
            </div>
            <div class="article-description">
                ${article.content}
            </div>
        </div>

    <#else>
    <div class="article-title">No posts</div>
    </#list>

    <div class="article-delimeter"></div>

</div>

<@p.pager url page/>

<@f.footer footer />

</@c.page>
