import request from '@/utils/request'

// 查询监测站点列表
export function listSite(query) {
  return request({
    url: '/system/site/list',
    method: 'get',
    params: query
  })
}

// 查询监测站点详细
export function getSite(siteId) {
  return request({
    url: '/system/site/' + siteId,
    method: 'get'
  })
}

// 新增监测站点
export function addSite(data) {
  return request({
    url: '/system/site',
    method: 'post',
    data: data
  })
}

// 修改监测站点
export function updateSite(data) {
  return request({
    url: '/system/site',
    method: 'put',
    data: data
  })
}

// 删除监测站点
export function delSite(siteId) {
  return request({
    url: '/system/site/' + siteId,
    method: 'delete'
  })
}
