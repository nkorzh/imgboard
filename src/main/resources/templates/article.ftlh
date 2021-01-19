<#import "common/common.ftlh" as c>
<#import "footer.ftlh" as f>

<@c.page>

<div class="sarticle-delimeter">
    <div class="sarticle-title-box">
        <a class="sarticle-title">${article.title}</a>
    </div>
</div>

<div class="sarticle-box">
    <div class="sarticle-description">
              <textarea  class="sarticle-description" readonly cols="90%" rows="20">${article.content}</textarea>
    </div>
    <div class="sarticle-meta">This post is written by <strong>${article.author}</strong> on <strong>${article.date}</strong></div>
</div>

<@f.footer footer />
</@c.page>