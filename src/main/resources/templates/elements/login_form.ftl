<#macro login path isRegisterForm>
<#import "/spring.ftl" as spring>
    <form action="${path}" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "label.user_name" />:</label>
            <div class="col-sm-6">
                <input type="text" name="username"
                       value="<#if user??>${user.username}</#if>"
                       class="form-control ${(usernameError??)?string('is-invalid', '')}"
                       autofocus
                       placeholder="<@spring.message "label.user_name" />"/>
            <#if usernameError??>
                <div class="invalid-feedback">
                    ${usernameError}
                </div>
            </#if>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "label.user_password" />:</label>
            <div class="col-sm-6">
                <input type="password" name="password"
                       class="form-control ${(passwordError??)?string('is-invalid', '')}"
                       placeholder="<@spring.message "label.user_password" />"/>
            <#if passwordError??>
                <div class="invalid-feedback">
                    ${passwordError}
                </div>
            </#if>
            </div>
        </div>
        <#if isRegisterForm>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "label.user_password_confirm" />:</label>
            <div class="col-sm-6">
                <input type="password" name="password2"
                       class="form-control ${(password2Error??)?string('is-invalid', '')}"
                       placeholder="<@spring.message "label.user_password_confirm" />"/>
            <#if password2Error??>
                <div class="invalid-feedback">
                    ${password2Error}
                </div>
            </#if>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"><@spring.message "label.user_email" />:</label>
            <div class="col-sm-6">
                <input type="email" name="email"
                       value="<#if user??>${user.email}</#if>"
                       class="form-control ${(emailError??)?string('is-invalid', '')}"
                       placeholder="<@spring.message "label.user_email" />"/>
                <#if emailError??>
                <div class="invalid-feedback">
                    ${emailError}
                </div>
                </#if>
            </div>
        </div>
        <#--<div class="col-sm-6 ">
            <div class="g-recaptcha" data-sitekey="6Le6lGUUAAAAAOnee1xxMbZCYeKWumRyqsJQSwF_"></div>
            <#if captchaError??>
                <div class="alert alert-danger" role="alert">
                    ${captchaError}
                </div>
            </#if>
        </div>-->
        </#if>
        <button type="submit" class="btn btn-primary"><#if isRegisterForm>Create<#else><@spring.message "label.user_signin" /></#if></button>
        <#if !isRegisterForm>&nbsp;<@spring.message "label.or" />&nbsp;<a class="btn btn-outline-info" href="/registration"><@spring.message "label.user_addnew" /></a></#if>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</#macro>

<#macro logout>
<#import "/spring.ftl" as spring>
    <form action="/logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <button type="submit" class="btn btn-primary"><@spring.message "label.user_signout" /></button>
    </form>
</#macro>