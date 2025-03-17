<template>
    <div>
        <el-dialog v-bind="$attrs" v-on="$listeners" @open="onOpen" @close="onClose" title="Dialog Title">
            <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
                <el-form-item label="手机号" prop="mobile">
                    <el-input v-model="formData.mobile" placeholder="请输入手机号" :maxlength="11" show-word-limit clearable
                        prefix-icon='el-icon-mobile' :style="{ width: '100%' }"></el-input>
                </el-form-item>
                <el-form-item label="下拉选择" prop="field101">
                    <el-select v-model="formData.field101" placeholder="请选择下拉选择" clearable :style="{ width: '100%' }">
                        <el-option v-for="(item, index) in field101Options" :key="index" :label="item.label"
                            :value="item.value" :disabled="item.disabled"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="日期选择" prop="field102">
                    <el-date-picker v-model="formData.field102" format="yyyy-MM-dd" value-format="yyyy-MM-dd"
                        :style="{ width: '100%' }" placeholder="请选择日期选择" clearable></el-date-picker>
                </el-form-item>
                <el-form-item label="颜色选择" prop="field103" required>
                    <el-color-picker v-model="formData.field103" size="medium"></el-color-picker>
                </el-form-item>
            </el-form>
            <div slot="footer">
                <el-button @click="close">取消</el-button>
                <el-button type="primary" @click="handleConfirm">确定</el-button>
            </div>
        </el-dialog>
    </div>
</template>
<script>
export default {
    name: 'TestDialog',
    inheritAttrs: false,
    components: {},
    props: [],
    data() {
        return {
            formData: {
                mobile: '',
                field101: undefined,
                field102: null,
                field103: null,
            },
            rules: {
                mobile: [{
                    required: true,
                    message: '请输入手机号',
                    trigger: 'blur'
                }, {
                    pattern: /^1(3|4|5|7|8|9)\d{9}$/,
                    message: '手机号格式错误',
                    trigger: 'blur'
                }],
                field101: [{
                    required: true,
                    message: '请选择下拉选择',
                    trigger: 'change'
                }],
                field102: [{
                    required: true,
                    message: '请选择日期选择',
                    trigger: 'change'
                }],
            },
            field101Options: [{
                "label": "选项一",
                "value": 1
            }, {
                "label": "选项二",
                "value": 2
            }],
        }
    },
    computed: {},
    watch: {},
    created() { },
    mounted() { },
    methods: {
        onOpen() { },
        onClose() {
            this.$refs['elForm'].resetFields()
        },
        close() {
            this.$emit('update:visible', false)
        },
        handleConfirm() {
            this.$refs['elForm'].validate(valid => {
                if (!valid) return
                this.close()
            })
        },
    }
}

</script>
<style></style>
