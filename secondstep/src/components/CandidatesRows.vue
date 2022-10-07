<template>
    <div class="table-row">
        <div class="name">
            <router-link class="text" to="/result/detail">{{ name }}</router-link>
        </div>
        <div class="rate">
            <img :class="className" src="@/assets/bar.png" />
            {{ percentage }}
        </div>
    </div>
</template>
<script>
export default {
    props: {
        name: String,
        percentage: String,
        className: String
    },
    data() {
        return {
        }
    },
}
</script>
<style lang="scss">
    .table-row {
        width: 90%;
        display: flex;
        .name {
            width: 250px;
            border: solid 1px black;
            text-align: center;
            .text {
              display: block;
              margin-top: 9px;  
            }
        }
        .rate {
            width: 100%;
            border: solid 1px black;
            padding-top: 10px;
            padding-bottom: 5px;
            .bar-50 {
                height: 20px;
                width: 250px;
            }
            .bar-10 {
                height: 20px;
                width: 50px;
            }
            .bar-15 {
                height: 20px;
                width: 75px;
            }
            .bar-5 {
                height: 20px;
                width: 25px;
            }
        }
    }
</style>