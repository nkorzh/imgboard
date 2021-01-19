<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="header">
    <a>Offrum</a>
    <div class="footer-muted-text"><strong>off</strong>topic fo<strong>rum</strong></div>
</div>

<div class="buttons">
    <button class="home-button" onclick="window.location.assign('/');">Home</button>
<!--    <button class="settings-button">Settings</button>-->
</div>
<#nested>
</body>
</html>
</#macro>